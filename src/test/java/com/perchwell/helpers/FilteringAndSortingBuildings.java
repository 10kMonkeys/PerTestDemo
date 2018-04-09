package com.perchwell.helpers;

import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class FilteringAndSortingBuildings {

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

        if (buildingList.size() > 0) {
            Iterator<WebElement> iterator = buildingList.iterator();

            while (iterator.hasNext()) {
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
            }
        }
        return k;
    }

    public static boolean isContainsStudios(List<WebElement> roomsInfoList) {
        if (roomsInfoList.size() > 0) {
            for(WebElement element: roomsInfoList) {
                String studioString = element.getAttribute("value");

                if (studioString.contains(" BD")) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean isContains4PlusParticularRooms(List<WebElement> roomsInfoList, String roomType) {
        float currentNumber;
        if (roomsInfoList.size() > 0) {

            for (WebElement element : roomsInfoList) {
                String s = element.getAttribute("value");
                System.out.println(s);
                currentNumber = getNumberFromString(roomType, s);
                    if (currentNumber < 4) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isContainParticularRoomsOrLabels(List<WebElement> buildingsElementsList, String rooms) {
        if (buildingsElementsList.size() > 0) {
            for(WebElement element: buildingsElementsList) {
                String roomsString = element.getAttribute("value");
                if (!roomsString.contains(rooms)) {
                    return false;
                }
            }
            return true;
        }
        return false;
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

    private static boolean checkBuildingOnMinFilterApplied(float currentPrice, String min) {
        boolean listingWithPriceFilter = true;

        float minPrice = Float.parseFloat(min);
        if (currentPrice < minPrice) {
            listingWithPriceFilter = false;
        }
        return listingWithPriceFilter;
    }

    private static boolean checkBuildingOnMaxFilterApplied(float currentPrice, String max) {
        boolean listingWithPriceFilter = true;
        float maxPrice = Float.parseFloat(max);

        if (currentPrice > maxPrice) {
            listingWithPriceFilter = false;
        }
        return listingWithPriceFilter;
    }

    private static boolean checkBuildingOnBetweenMinAndMaxFilterApplied(float currentPrice, String min, String max) {
        boolean listingWithPriceFilter = true;
        float minPrice = Float.parseFloat(min);
        float maxPrice = Float.parseFloat(max);

        if (currentPrice > maxPrice || currentPrice < minPrice) {
            listingWithPriceFilter = false;
        }
        return listingWithPriceFilter;
    }

    public static boolean isPriceFilterAppliedOnListings(String typePriceFilter, List<WebElement> pricesList, String min, String max) {
        boolean listingWithPriceFilter = true;
        int numberCheckedPrices = 0;
        int numberPricesToCheck = pricesList.size() < 10 ? pricesList.size() : 10;

        if (pricesList.size() > 0) {
            Iterator<WebElement> iterator = pricesList.iterator();

            while (iterator.hasNext() && (numberCheckedPrices < numberPricesToCheck)) {
                String s = iterator.next().getAttribute("value");
                float currentPrice = FilteringAndSortingBuildings.getNumberFromString("price", s);

                switch (typePriceFilter) {
                    case "min" :
                        listingWithPriceFilter = checkBuildingOnMinFilterApplied(currentPrice, min);
                        break;

                    case "max" :
                        listingWithPriceFilter = checkBuildingOnMaxFilterApplied(currentPrice, max);
                        break;

                    case "between min and max" :
                        listingWithPriceFilter = checkBuildingOnBetweenMinAndMaxFilterApplied(currentPrice, min, max);
                        break;
                }

                if (!listingWithPriceFilter) {
                    return listingWithPriceFilter;
                }
                numberCheckedPrices++;
            }
        }
        return listingWithPriceFilter;
    }
}
