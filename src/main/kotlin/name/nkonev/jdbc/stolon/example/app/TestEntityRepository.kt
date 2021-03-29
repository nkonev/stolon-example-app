package name.nkonev.jdbc.stolon.example.app

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface TestEntityRepository: CrudRepository<TestEntity, Long> {
}