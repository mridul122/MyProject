package Practice;

import org.apache.kafka.common.protocol.types.Field;

public class SearchDetails {


    public String audit_dt;
    public String searchExpression;




    public void setSearchExpression(String searchExpression)
    {
        this.searchExpression = searchExpression;
    }




    public String getSearchExpression() {
        //System.out.println(searchExpression);
        return searchExpression;
    }




    public void setAudit_dt(String audit_dt) {
        this.audit_dt = audit_dt;
    }
    public String getAudit_dt() {
        //System.out.println(audit_dt);
        return audit_dt;
    }
}
