package StockItemRequest.StockItemRequestJSC.Repo;


import StockItemRequest.StockItemRequestJSC.model.StockItemRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockItemRequestRepository extends JpaRepository<StockItemRequest,Long> {

    StockItemRequest findByProductCode(Integer productCode );





}
