package com.example.raywilliams.firstkotlin.domain.command

public interface Command<out T> {
    fun execute(): T
}