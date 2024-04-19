package SERVER;
import USER.VOTING;
public class CANDIDATE {
    public string getCand_name() {
        return cand_name;
    }

    public void setCand_name(string cand_name) {
        this.cand_name = cand_name;
    }

    public string getParty_symbol() {
        return party_symbol;
    }

    public void setParty_symbol(string party_symbol) {
        this.party_symbol = party_symbol;
    }

    public string getPosition() {
        return position;
    }

    public void setPosition(string position) {
        this.position = position;
    }

    public string cand_name;
    public string party_symbol;
    public string position;

    public void consistency(){

    }
    public void submit_nomination(){

    }
    public void cancel_nomination(){

    }
}
