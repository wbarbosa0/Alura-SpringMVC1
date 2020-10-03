package br.nom.warbosa.mvc.mudi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.nom.warbosa.mvc.mudi.model.entity.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
