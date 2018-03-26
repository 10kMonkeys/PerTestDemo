package com.perchwell.helpers;

import org.openqa.selenium.WebElement;

import java.util.List;

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
                System.out.println(roomsNumbers[i]); //REMOVE
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
}
