package name.nkonev.jdbc.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface TestEntityRepository: CrudRepository<TestEntity, Long> {
}