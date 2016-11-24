package com.example.nedias.filemanager;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.nedias.filemanager.entites.TestSugarEntity;
import com.orm.SugarContext;

import java.math.BigDecimal;

import butterknife.Bind;
import butterknife.OnClick;
import butterknife.ButterKnife;


public class MainFrame extends Activity {

    @Bind(R.id.Btn_Search)
    Button btnSearch;
    @Bind(R.id.Btn_Connect)
    Button btnConnect;
    @Bind(R.id.Txt_Peers)
    TextView txtPeers;
    @Bind(R.id.Txt_Peer)
    TextView txtPeer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_frame);
        ButterKnife.bind(this);
        txtPeer.setText("No peers...");

    }

    @OnClick(R.id.Btn_Search)
    public void searchPeer() {
        txtPeer.setText("Peer 1");
        TestSugar();
    }

    @OnClick(R.id.Btn_Connect)
    public void connectPeer() {

        TestSugarEntity testEntity = LoadTestSugar();
        StringBuilder strB = new StringBuilder();
        strB.append(testEntity.getTestPrimary()).append("_").append(testEntity.getTestChar())
                .append("_").append(testEntity.getTestChar()).append("_").append(testEntity
                .getTestNum());
        txtPeer.setText(strB.toString());
    }

    public void TestSugar() {
        TestSugarEntity testEntity = new TestSugarEntity(10001, "T", "TestString", true, new
                BigDecimal(20), 3.14);
        testEntity.save();
    }

    public TestSugarEntity LoadTestSugar(){
        return TestSugarEntity.findAll(TestSugarEntity.class).next();
    }

}
