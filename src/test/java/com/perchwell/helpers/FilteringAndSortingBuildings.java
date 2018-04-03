package com.perchwell.helpers;

import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class FilteringAndSortingBuildings {

    public static boolean isSortedByRooms(List<WebElement> roomsInfoList, String roomType) {
        String[] roomsData = new String[5];
        int[] roomsNumbers = new int[5];

        if (roomsInfoList.size() > 0) {
            for (int i = 0; (i < 5 && i < roomsInfoList.size()); i++) {
                StringBuilder baQty = new StringBuilder();
                String[] roomsValues = roomsInfoList.get(i).getAttribute("value").split("\\|");

                for (int j = 0; j < roomsValues.length; j++) {
                    if (roomsValues[j].contains(roomType)) {
                        roomsData[i] = roomsValues[j];
                    } else if ((roomsData[i] == null) && j == (roomsValues.length - 1)) {
                        return false;
                    }
                }

                for (int k = 0; k < roomsData[i].length(); k++) {
                    if (Character.isDigit(roomsData[i].charAt(k))) {
                        baQty.append(String.valueOf(roomsData[i].charAt(k)));
                    }
                }

                roomsNumbers[i] = Integer.parseInt(String.valueOf(baQty));
            }

            for (int d = 0; (d < 4 && d < (roomsInfoList.size() - 1)); d++) {
                if (roomsNumbers[d] < roomsNumbers[d + 1]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static float getNumberFromString(String typeSorting, String input) {
        float output;
        String price = "^\\$\\d+.*$";
        String room = "";
        Pattern p = Pattern.compile("");

        if (!input.matches(price)) {

            switch (typeSorting) {
                case "bedrooms":
                    p = Pattern.compile("\\d+ BD");
                    break;

                case "bathrooms":
                    p = Pattern.compile("\\d+.?\\d* BA");
                    break;
            }
            Matcher m = p.matcher(input);

            while (m.find()) {
                room = m.group();
            }

            if ((room.contains("BD") || room.contains("BA")) && (room.contains("½"))) {
                room = room.substring(0, room.length() - 4);
            } else if (room.contains("BD") || room.contains("BA")) {
                room = room.substring(0, room.length() - 3);
            } else {
                room = "0";
            }
            return Float.parseFloat(room);
        }

        String outputString = Helper.removeChar(input, '$');
        outputString = Helper.removeChar(outputString, ',');
        output = Float.parseFloat(outputString);
        return output;
    }

    public static boolean isBuildingInAscendingOrder(float num1, float num2) {
        int k = 0;

        if (num1 < num2) {
            k++;
        }

        return k == 0;
    }

    public static boolean isBuildingInDescendingOrder(float num1, float num2) {
        int k = 0;

        if (num1 <= num2) {
            k++;
        }

        return k == 1;
    }

    public static int getCounterInSorting(String typeSorting, List<WebElement> buildingList) {
        float currentNumber = 0.f;
        int k = 0;
        float numberToCompare = 0.f;
        boolean buildingSort = false;
        int numberCheckedBuildings = 0;

        if (buildingList.size() > 0) {
            Iterator<WebElement> iterator = buildingList.iterator();

            while (iterator.hasNext() && (numberCheckedBuildings < 10)) {
                String s = iterator.next().getAttribute("value");

                switch (typeSorting) {
                    case "bedrooms":
                        currentNumber = getNumberFromString("bedrooms", s);
                        buildingSort = FilteringAndSortingBuildings.isBuildingInDescendingOrder(currentNumber, numberToCompare);
                        break;

                    case "bathrooms":
                        currentNumber = getNumberFromString("bathrooms", s);
                        buildingSort = FilteringAndSortingBuildings.isBuildingInDescendingOrder(currentNumber, numberToCompare);
                        break;

                    case "priceMost":
                        currentNumber = getNumberFromString("priceMost", s);
                        buildingSort = FilteringAndSortingBuildings.isBuildingInDescendingOrder(currentNumber, numberToCompare);
                        break;

                    case "priceLeast":
                        currentNumber = getNumberFromString("priceLeast", s);
                        buildingSort = FilteringAndSortingBuildings.isBuildingInAscendingOrder(currentNumber, numberToCompare);
                        break;
                }

                if (!buildingSort) {
                    k++;
                }

                numberToCompare = currentNumber;
                numberCheckedBuildings++;
            }
        }
        return k;
    }

    public static boolean isSomeInfoPresentInBuildings(String info, List<WebElement> roomsInfoList) {
        boolean infoRoomPresent = true;
        int numberCheckedBuildings = 0;
        int numberBuildingToCheck = roomsInfoList.size() < 10 ? roomsInfoList.size() : 10;

        Iterator<WebElement> iterator = roomsInfoList.iterator();

        while (iterator.hasNext() && (numberCheckedBuildings < numberBuildingToCheck)) {
            String infoRoom = iterator.next().getAttribute("value");
            if (!infoRoom.contains(info)) {
                infoRoomPresent = false;
                break;
            }
            numberCheckedBuildings++;
        }
        return infoRoomPresent;
    }
}
