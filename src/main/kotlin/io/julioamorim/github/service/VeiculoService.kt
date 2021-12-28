package io.julioamorim.github.service

import io.julioamorim.github.model.Veiculo
import io.julioamorim.github.repository.VeiculoRepository
import jakarta.inject.Singleton

@Singleton
class VeiculoService(
        private val veiculoRepository: VeiculoRepository
) {
    fun create(veiculo: Veiculo): Veiculo {
        return veiculoRepository.save(veiculo)
    }

    fun findById(id: Long): Veiculo {
        return veiculoRepository.findById(id).get() // nao é uma boa prática, deveria ser tratado erro aqui
    }
}