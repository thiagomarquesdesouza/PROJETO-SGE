package br.com.sgv.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.sgv.model.Venda;

/**
 *
 * @author Pablo Rangel <pablo.rangel@gmail.com>
 */
public interface SaidaRepository extends CrudRepository<Venda,Long>{
    
}
