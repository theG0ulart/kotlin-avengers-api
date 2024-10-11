package edu.wearedev.avengers.infra.repository.impl

import edu.wearedev.avengers.domain.model.Avenger
import edu.wearedev.avengers.domain.repository.AvengerRepository
import edu.wearedev.avengers.infra.entity.AvengerEntity
import edu.wearedev.avengers.infra.repository.AvengerEntityRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class AvengerRepositoryImpl(
    @Autowired private val repository: AvengerEntityRepository
): AvengerRepository {
    override fun getDetail(id: Long): Avenger? =
        repository.findByIdOrNull(id)?.toAvenger()


    override fun getAvengers(): List<Avenger> =
        repository.findAll().map { it.toAvenger() }


    override fun create(avenger: Avenger): Avenger =
        repository.save(AvengerEntity.from(avenger)).toAvenger()


    override fun delete(id: Long) = repository.deleteById(id)


    override fun update(avenger: Avenger): Avenger =
        repository.save(AvengerEntity.from(avenger)).toAvenger()

}