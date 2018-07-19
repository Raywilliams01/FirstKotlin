package com.example.raywilliams.firstkotlin.domain.command


import com.example.raywilliams.firstkotlin.data.ForecastRequest
import com.example.raywilliams.firstkotlin.domain.mappers.ForecastDataMapper
import com.example.raywilliams.firstkotlin.domain.model.ForecastList

class RequestForecastCommand(val zipCode: String):
        Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(
                forecastRequest.execute())
    }
}