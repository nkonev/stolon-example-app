package name.nkonev.jdbc.stolon.example.app

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("test")
data class TestEntity(
    @Id
    var id: Integer? = null,
    var value: String = "",
)
