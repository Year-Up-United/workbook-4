package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
        @Test
        public void checkIn_after_occupancyShouldBeTrue(){
        // arrange
        Room r = new Room(1, 150);
        // act
        r.checkIn();
        // assert
        assertTrue(r.isOccupied);

        }
        public void checkIn_after_dirtyShouldBesTrue(){


        }
        public void checkIn_after_availableShouldBeFalse(){


        }
        public void checkOut_after_occupiedShouldBeFalse(){
        // arrange
        r.checkIn();
        // act
        r.checkout();
        // assert
        assertFalse(r.isOccupied());

        }
        public void clean_after_availableShouldBeFalse(){


       }
        public void cleanRoom_after_occupiedShouldBeFalse(){

    }

}