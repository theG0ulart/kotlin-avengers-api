package edu.wearedev.avengers.infra.repository

import edu.wearedev.avengers.infra.entity.AvengerEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AvengerEntityRepository: JpaRepository<AvengerEntity, Long> {
}