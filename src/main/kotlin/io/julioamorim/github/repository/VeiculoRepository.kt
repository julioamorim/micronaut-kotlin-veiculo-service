package io.julioamorim.github.repository

import io.julioamorim.github.model.Veiculo
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface VeiculoRepository : JpaRepository<Veiculo, Long> {
}