package org.stock.services;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.stock.models.BankAccount;
import org.stock.models.CompanyStocks;
import org.stock.models.Player;
import org.stock.models.PlayerStocks;
import org.stock.models.StockTransactions;
import org.stock.resource.BankAccountDAO;
import org.stock.resource.CompanyStocksDAO;
import org.stock.resource.PlayerDAO;
import org.stock.resource.PlayerStocksDAO;
import org.stock.resource.StockTransactionsDAO;

@Path("/broker")
public class BrokerService {
	@GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<CompanyStocks> getStockPrices() {
        List<CompanyStocks> companies = CompanyStocksDAO.getAll();
        return companies;
    }
	
	@GET
    @Path("/{player}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Player getPlayer(@PathParam("player") String player) {
        return PlayerDAO.get(player);
    }
	
	@GET
    @Path("stock-trans/{player}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<StockTransactions> getTrans(@PathParam("player") String player) {
        return StockTransactionsDAO.getTransactions(player);
    }
	@GET
    @Path("player-stocks/{player}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<PlayerStocks> getPlayerStocks(@PathParam("player") String player) {
        return PlayerStocksDAO.getStocks(player);
    }
	
	@POST
	@Path("new-player")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Player addplayer(Player player) {
		BankAccount bank_account=new BankAccount(player.getPlayer_name());
		BankAccountDAO.save(bank_account);
        return PlayerDAO.save(player);
    }
	
}
