package crypto.value.entity.coinlore;

import java.util.List;

public class CoinloreResponse {
    public List<Coin> data;
    public CoinloreInfo info;

    public CoinloreResponse() {
    }

    public List<Coin> getData() {
        return data;
    }

    public void setData(List<Coin> data) {
        this.data = data;
    }

    public CoinloreInfo getInfo() {
        return info;
    }

    public void setInfo(CoinloreInfo info) {
        this.info = info;
    }
}
