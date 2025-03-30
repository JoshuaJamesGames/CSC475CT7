package com.example.csc475ct7

import android.widget.EditText

object ConvertUtil {
    fun farenheitToCelcius(farenheit: Float): Float{

            return (farenheit - 32) * 5 / 9

    }
    fun celciusToFarenHeit(celcius: Float):Float{

            return (celcius * 9 / 5) + 32

    }
    fun poundsToKilograms(pounds: Float): Float{
        return (pounds/2.20462F)
    }
    fun kilogramsToPounds(kilograms: Float): Float{
        return (kilograms*2.20462F)
    }
    fun milesToKilometers(miles: Float):Float{
        return (miles*1.60834F)
    }
    fun kilometersToMiles(kilometers: Float):Float{
        return (kilometers/1.60834F)
    }
    fun gallonsToLiters(gallons :Float):Float{
        return (gallons*3.78541F)
    }
    fun litersToGallons(liters: Float):Float{
        return (liters/3.78541F)
    }
    fun acresToSquareFeet(acres :Float):Float{
        return (acres*43560F)
    }
    fun squareFeetToAcres(squareFeet :Float):Float{
        return (squareFeet/43560F)
    }
    fun dogYearsToHumanYears(dogYears :Float):Float{
        val calculationTemp: Float = when(dogYears){
            1F -> 15F
            2F -> 29F
            else -> {29F + (dogYears-2F) * 5F}
        }
        return calculationTemp
    }
    fun humanYearsToDogYears(humanYears :Float):Float{
        val calculationTemp: Float = when(humanYears){
            15F -> 1F
            29F -> 2F
            else -> {2+ (humanYears-29F) / 5F}
        }
        return calculationTemp
    }

}