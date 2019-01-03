package org.melektro.GetHistory;

import static com.melektro.Tools.ExtAPIs.GetADay_Formatted;
import java.io.IOException;
import javax.ws.rs.Produces;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("gethistory")
public class GetHistory {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("getdate/")
    public String OutputString(@QueryParam("dt") @DefaultValue("") String inputStr) throws IOException, InterruptedException {
        return GetADay_Formatted(inputStr);
    }
}
