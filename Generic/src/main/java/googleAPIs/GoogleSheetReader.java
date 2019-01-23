package googleAPIs;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.ValueRange;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class GoogleSheetReader {
    // Application name.
    private static final String APPLICATION_NAME = "Google Sheets API Java GoogleSheetReader";
    // Directory to store user credentials for this application.
    private static final java.io.File DATA_STORE_DIR = new java.io.File(System.getProperty("user.dir"), ".credentials/sheets-googleapis");
    // Global instance of the {@link FileDataStoreFactory}.
    private static FileDataStoreFactory DATA_STORE_FACTORY;
    // Global instance of the JSON factory.
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    // Global instance of the HTTP transport.
    private static HttpTransport HTTP_TRANSPORT;
    // Global instance of the scopes
    private static final List<String> SCOPES = Arrays.asList(SheetsScopes.SPREADSHEETS_READONLY);

    static {
        try {
            HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
            DATA_STORE_FACTORY = new FileDataStoreFactory(DATA_STORE_DIR);
        } catch (Throwable t) {
            t.printStackTrace();
            System.exit(1);
        }
    }
    /**
     * Creates an authorized Credential object.
     *
     * @return an authorized Credential object.
     * @throws IOException
     */
    public static Credential authorize() throws IOException {



        InputStream in    = new FileInputStream("C:\\Users\\mohamed .LAPTOP-QCE4AIJL\\IdeaProjects\\WebAutomationTasneemCNN2019\\Generic\\src\\main\\resources\\client_id.json");
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));
        // Build flow and trigger user authorization request.
        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(DATA_STORE_FACTORY)
                .setAccessType("offline")
                .build();
        Credential credential = new AuthorizationCodeInstalledApp(flow, new LocalServerReceiver()).authorize("user");
        System.out.println("Credentials saved to " + DATA_STORE_DIR.getAbsolutePath());
        return credential;
    }
    /**
     * Build and return an authorized Sheets API client service.
     *
     * @return an authorized Sheets API client service
     * @throws IOException
     */
    public static Sheets getSheetsService() throws IOException {
        Credential credential = authorize();
        return new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, credential)
                .setApplicationName(APPLICATION_NAME)
                .build();
    }
    public static List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        // Build a new authorized API client service.
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }

    /**
     * This method will return two dimensional array
     * We can use it with @DataProvider annotations
     *
     * */

    public static String[][] getSpreadSheetRecordsToSupplyDataProvider(String spreadsheetId, String range) throws IOException {
        // Build a new authorized API client service.

        List<List<Object>> getSpreadSheetRecords = getSpreadSheetRecords(spreadsheetId, range);

        String[][] array = new String[getSpreadSheetRecords.size()][];

        for (int i = 0; i < getSpreadSheetRecords.size(); i++) {
            List<Object> row = getSpreadSheetRecords.get(i);
            array[i] = row.toArray(new String[row.size()]);
        }
        return array;
    }
    /**
     * Alternative way to convert List to 2d Array
     *
     * */
    public static String[][] getSpreadSheetRecordsToSupplyDataProviderAlternativeWay(String spreadsheetId, String range) throws IOException {
        // Build a new authorized API client service.

        List<List<Object>> getSpreadSheetRecords = getSpreadSheetRecords(spreadsheetId, range);
        String[][] array = getSpreadSheetRecords.stream().map(u -> u.toArray(new String[0])).toArray(String[][]::new);
        return array;
    }

}



