package com.parham.msu.criminal_intent_CH12.database

import androidx.room.Dao
import androidx.room.Query
import com.parham.msu.criminal_intent_CH12.Crime
import java.util.UUID

@Dao
interface CrimeDao {
    @Query("SELECT * FROM crime")
    suspend fun getCrimes(): List<Crime>

    @Query("SELECT * FROM crime WHERE id=(:id)")
    suspend fun getCrime(id: UUID): Crime
}