package iw4.utils

import java.sql.Timestamp
import java.time.LocalDateTime
import java.util.*

object Misc {

    fun getDateAsTimestamp(): Timestamp {
        return Timestamp(Date().time)
    }

    fun getLocalDateAsTimestamp() : Timestamp {
        val date = LocalDateTime.now()
        return Timestamp.valueOf(date)
    }

    fun getLocalDateAsTimestamp(minusMinutes: Long): Timestamp? {
        val date = LocalDateTime.now().minusMinutes(minusMinutes)
        return Timestamp.valueOf(date)
    }

}