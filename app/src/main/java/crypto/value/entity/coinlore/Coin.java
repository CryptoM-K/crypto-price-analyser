package crypto.value.entity.coinlore;

import javax.json.bind.annotation.JsonbProperty;

public class Coin {
    public String id;

    public String symbol;

    public String name;

    public String nameid;

    public int rank;

    @JsonbProperty("coins_count")
    private Double priceUsd;

    @JsonbProperty("price_btc")
    private Double priceBtc;

    @JsonbProperty("percent_change_24h")
    public String percentChange24h;

    @JsonbProperty("percent_change_1h")
    public String percentChange1h;

    @JsonbProperty("percent_change_7d")
    public String percentChange7d;

    @JsonbProperty("market_cap_usd")
    public String marketCapUsd;

    public double volume24;

    public double volume24a;

    public String csupply;

    public String tsupply;

    public String msupply;

    public Coin() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameid() {
        return nameid;
    }

    public void setNameid(String nameid) {
        this.nameid = nameid;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Double getPriceUsd() {
        return priceUsd;
    }

    public void setPriceUsd(Double priceUsd) {
        this.priceUsd = priceUsd;
    }

    public Double getPriceBtc() {
        return priceBtc;
    }

    public void setPriceBtc(Double priceBtc) {
        this.priceBtc = priceBtc;
    }

    public String getPercentChange24h() {
        return percentChange24h;
    }

    public void setPercentChange24h(String percentChange24h) {
        this.percentChange24h = percentChange24h;
    }

    public String getPercentChange1h() {
        return percentChange1h;
    }

    public void setPercentChange1h(String percentChange1h) {
        this.percentChange1h = percentChange1h;
    }

    public String getPercentChange7d() {
        return percentChange7d;
    }

    public void setPercentChange7d(String percentChange7d) {
        this.percentChange7d = percentChange7d;
    }

    public String getMarketCapUsd() {
        return marketCapUsd;
    }

    public void setMarketCapUsd(String marketCapUsd) {
        this.marketCapUsd = marketCapUsd;
    }

    public double getVolume24() {
        return volume24;
    }

    public void setVolume24(double volume24) {
        this.volume24 = volume24;
    }

    public double getVolume24a() {
        return volume24a;
    }

    public void setVolume24a(double volume24a) {
        this.volume24a = volume24a;
    }

    public String getCsupply() {
        return csupply;
    }

    public void setCsupply(String csupply) {
        this.csupply = csupply;
    }

    public String getTsupply() {
        return tsupply;
    }

    public void setTsupply(String tsupply) {
        this.tsupply = tsupply;
    }

    public String getMsupply() {
        return msupply;
    }

    public void setMsupply(String msupply) {
        this.msupply = msupply;
    }
}
