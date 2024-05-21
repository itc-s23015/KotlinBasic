package com.example.chap26

import java.time.LocalDate
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val book = Book(
        100,
        "やさしいKotlin入門",
        "野崎英一",
        LocalDate.of(2018, 5, 10)
    )

    val rental = Rental(
        book.id,
        "takesi",
        LocalDateTime.now()
        LocalDateTime.of(2024, 5, 10, 10, 10)

    val bookWithRental = BookWithRental(
        book, rental
    )

    val bookInfo = BookInfo(
        bookWithRental.book.id,
        bookWithRental.book.title,
        bookWithRental.book.author,
        bookWithRental.isRental
    )

    bookInfo.printInfo()
}

class BookInfo (
    val id: Long,
    val title: String,
    val author: String,
    val isRental: Boolean,
){
    fun printInfo() {
        println(
            """
            [ID:${id} &title (${author})
            $(if (isRental) "貸出中です" else "貸出可能です}    
            """.trimIndent()
        )
    }


class Book(
    val id: Long,
    val title: String,
    val author: String,
    val releaseDate: LocalDate,
)
class Rental (
    val bookid: Long,
    val userName: String,
    val rentalDateTime: LocalDateTime,
    val returnDeadLine: LocalDateTime
)

class BookWithRental(
    val book: Book,
    val rental: Rental?
) {
    val isRental: Boolean
        get() = rental != null
}