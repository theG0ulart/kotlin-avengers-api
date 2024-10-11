package edu.wearedev.avengers.domain.repository

import edu.wearedev.avengers.domain.model.Avenger

interface AvengerRepository {
    fun getDetail(id: Long): Avenger?
    fun getAvengers(): List<Avenger>
    fun create(avenger: Avenger): Avenger
    fun delete(id: Long)
    fun update(avenger: Avenger): Avenger
}