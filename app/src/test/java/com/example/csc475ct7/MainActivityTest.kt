package com.example.csc475ct7


import org.junit.Assert.*
import org.junit.Test

class MainActivityTest{

 @Test fun `farenheitToCelcius converts farenheit to celcius`(){
        val farenheit = 32F
        assertEquals("", 0.0F, ConvertUtil.farenheitToCelcius(farenheit))
 }
 @Test fun `convertToFarenHeit converts celcus to farenheit`(){
       val celcius = 100F
       assertEquals(212F, ConvertUtil.celciusToFarenHeit(celcius))
 }
@Test fun `poundsToKilograms converts pounds to kilograms`(){
    val pounds = 2F
    assertEquals(.90718585F, ConvertUtil.poundsToKilograms(pounds))
}
    @Test fun `kilogramsToPounds converts kilograms to pounds`(){
        val kilograms = 2F
        assertEquals(4.40924F, ConvertUtil.kilogramsToPounds(kilograms))
    }
    @Test fun `milesToKilometers converts miles to kilometers`(){
        val miles = 10F
        assertEquals(16.0834F, ConvertUtil.milesToKilometers(miles))
    }
    @Test fun `kilometersToMiles converts kilometers to miles`(){
        val kilometers = 10F
        assertEquals(6.217591F, ConvertUtil.kilometersToMiles(kilometers))
    }
    @Test fun `gallonsToLiters converts gallons to liters`(){
        val gallons = 2F
        assertEquals(7.57082F, ConvertUtil.gallonsToLiters(gallons))
    }
    @Test fun `litersToGallons converts liters to gallons`(){
        val liters = 2F
        assertEquals(0.5283444F, ConvertUtil.litersToGallons(liters))
    }
    @Test fun `acresToSquareFeet converts acres to squarefeet`(){
        val acres = 1F
        assertEquals(43560F, ConvertUtil.acresToSquareFeet(acres))
    }
    @Test fun `squareFeetToAcres converts squarefeet to acres`(){
        val squareFeet = 43560F
        assertEquals(1F, ConvertUtil.squareFeetToAcres(squareFeet))
    }
    @Test fun `dogYearsToHumanYears converts dog years to human years`(){
        val dogYears = 3F
        assertEquals(34F, ConvertUtil.dogYearsToHumanYears(dogYears))
    }
    @Test fun `humanYearsToDogYears converts human years to dog years`(){
        val humanYears = 15F
        assertEquals(1F, ConvertUtil.humanYearsToDogYears(humanYears))
    }


 }