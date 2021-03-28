package name.nkonev.jdbc.repository

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("test")
data class TestEntity(
    @Id
    var id: Integer? = null,
    var value: String = "",
)
