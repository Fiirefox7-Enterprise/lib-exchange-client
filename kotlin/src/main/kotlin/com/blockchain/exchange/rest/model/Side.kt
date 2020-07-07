/**
* Blockchain.com Exchange REST API
* ## Introduction Welcome to Blockchain.com's Exchange API and developer documentation. These documents detail and give examples of various functionality offered by the API such as receiving real time market data, requesting balance information and performing trades. ## To Get Started Create or log into your existing Blockchain.com Exchange account Select API from the drop down menu Fill out form and click “Create New API Key Now” Once generated you can view your keys under API Settings 
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.blockchain.exchange.rest.model


import com.squareup.moshi.Json

/**
* \"buy\" for Buy, \"sell\" for Sell
* Values: BUY,SELL
*/

enum class Side(val value: kotlin.String){


    @Json(name = "BUY")
    BUY("BUY"),


    @Json(name = "SELL")
    SELL("SELL");



	/**
	This override toString avoids using the enum var name and uses the actual api value instead.
	In cases the var name and value are different, the client would send incorrect enums to the server.
	**/
	override fun toString(): String {
        return value
    }

}
