package png.jme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class home extends Activity implements View.OnClickListener {
    RelativeLayout workorder, siteweight, factorymgmt, ho, hl, blockpost, iqf, packstores,complaints,despatch,
            stockreport,orderstatus,loadingstatus,indent,complaint,message,reports;
    ImageView logout, profile, home, notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        workorder = (RelativeLayout) findViewById(R.id.workorder);
        siteweight = (RelativeLayout) findViewById(R.id.siteweight);
        factorymgmt = (RelativeLayout) findViewById(R.id.factorymgmt);
        ho = (RelativeLayout) findViewById(R.id.ho);
        hl = (RelativeLayout) findViewById(R.id.hl);
        blockpost = (RelativeLayout) findViewById(R.id.blockpost);
        iqf = (RelativeLayout) findViewById(R.id.iqf);
        packstores = (RelativeLayout) findViewById(R.id.packstores);
        despatch = (RelativeLayout) findViewById(R.id.despatch);

        stockreport = (RelativeLayout) findViewById(R.id.stockreport);
        orderstatus = (RelativeLayout) findViewById(R.id.orderstatus);
        loadingstatus = (RelativeLayout) findViewById(R.id.loadingstatus);
        indent = (RelativeLayout) findViewById(R.id.indent);
        complaint = (RelativeLayout) findViewById(R.id.complaint);
        message = (RelativeLayout) findViewById(R.id.message);
        reports = (RelativeLayout) findViewById(R.id.reports);
        home = (ImageView) findViewById(R.id.home);
        profile = (ImageView) findViewById(R.id.profile);
        logout = (ImageView) findViewById(R.id.logout);
        notification = (ImageView) findViewById(R.id.notification);

        workorder.setOnClickListener(this);
        siteweight.setOnClickListener(this);
        factorymgmt.setOnClickListener(this);
        ho.setOnClickListener(this);
        hl.setOnClickListener(this);
        blockpost.setOnClickListener(this);
        iqf.setOnClickListener(this);
        packstores.setOnClickListener(this);
        despatch.setOnClickListener(this);
        stockreport.setOnClickListener(this);
        orderstatus.setOnClickListener(this);
        loadingstatus.setOnClickListener(this);
        indent.setOnClickListener(this);
        complaint.setOnClickListener(this);
        message.setOnClickListener(this);
        reports.setOnClickListener(this);

        home.setOnClickListener(this);
        profile.setOnClickListener(this);
        logout.setOnClickListener(this);
        notification.setOnClickListener(this);
        complaint.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.stockreport:
                Intent i = new Intent(home.this, Profile.class);
                startActivity(i);
                break;
            case R.id.orderstatus:
                Intent orderstatus = new Intent(home.this, Profile.class);
                startActivity(orderstatus);
                break;
            case R.id.loadingstatus:
                Intent loadingstatus = new Intent(home.this, Profile.class);
                startActivity(loadingstatus);
                break;
            case R.id.indent:
                Intent indent = new Intent(home.this, Profile.class);
                startActivity(indent);
                break;
            case R.id.complaint:
                Intent complaint = new Intent(home.this, Profile.class);
                startActivity(complaint);
                break;
            case R.id.message:
                Intent message = new Intent(home.this, Profile.class);
                startActivity(message);
                break;
            case R.id.reports:
                Intent reports = new Intent(home.this, Profile.class);
                startActivity(reports);
                break;



            case R.id.workorder:
                Intent workorder = new Intent(home.this, Profile.class);
                startActivity(workorder);
                break;
            case R.id.siteweight:
                Intent orders = new Intent(home.this, Profile.class);
                startActivity(orders);
                break;
            case R.id.factorymgmt:
                Intent receipt = new Intent(home.this, Profile.class);
                startActivity(receipt);
                break;
            case R.id.ho:
                Intent product = new Intent(home.this, Profile.class);
                startActivity(product);
                break;
            case R.id.hl:
                Intent complaints = new Intent(home.this, Profile.class);
                startActivity(complaints);
                break;
            case R.id.blockpost:
                Intent expenses = new Intent(home.this, Profile.class);
                startActivity(expenses);
                break;
            case R.id.iqf:
                Intent outstanding = new Intent(home.this, Profile.class);
                startActivity(outstanding);
                break;
            case R.id.packstores:
                Intent salesdetails = new Intent(home.this, Profile.class);
                startActivity(salesdetails);
                break;
            case R.id.despatch:
                Intent mail = new Intent(home.this, Profile.class);
                startActivity(mail);
                break;
            case R.id.home:
                Intent home = new Intent(home.this, Profile.class);
                startActivity(home);
                break;
            case R.id.profile:
                Intent profile = new Intent(home.this, Profile.class);
                startActivity(profile);
                break;
            case R.id.logout:
                finish();
                break;
            case R.id.notification:
                Intent notification = new Intent(home.this, Profile.class);
                startActivity(notification);
                break;

        }
    }
}
