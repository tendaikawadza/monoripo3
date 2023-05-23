package StockItemRequest.StockItemRequestJSC.Service;

import StockItemRequest.StockItemRequestJSC.Repo.StockItemRequestRepository;
import StockItemRequest.StockItemRequestJSC.model.StockItemRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StockItemRequestService {

    @Autowired
    private StockItemRequestRepository stockItemRequestRepository;



    public StockItemRequest createStockItemRequest( StockItemRequest stockItemRequest)    {

        return stockItemRequestRepository.save(stockItemRequest);
    }



    public StockItemRequest getStockItemRequestId(  Long stockItemRequestId ) {
        return stockItemRequestRepository.findById(stockItemRequestId).get();
    }


    public StockItemRequest updateStockItemRequest(StockItemRequest stockItemRequestObject)
    {
        return stockItemRequestRepository.save(stockItemRequestObject);
    }


    public void deleteStockItemRequest(Long stockiemrequestid) {
        stockItemRequestRepository.deleteById(stockiemrequestid);
    }

    public List<StockItemRequest> getAllStockItemRequest() {
        return stockItemRequestRepository.findAll();
    }


}
