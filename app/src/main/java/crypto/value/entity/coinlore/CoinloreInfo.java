package crypto.value.entity.coinlore;

import javax.json.bind.annotation.JsonbProperty;

public class CoinloreInfo {

    @JsonbProperty("coins_num")
    public int coinsNum;
    public int time;

    public CoinloreInfo() {
    }

    public int getCoinsNum() {
        return coinsNum;
    }

    public void setCoinsNum(int coinsNum) {
        this.coinsNum = coinsNum;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
