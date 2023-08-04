package com.example.medicinedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetailsActivity extends AppCompatActivity {
        private String[][] doctor_details1 =
                {
                        {"Doctor Name:Ajit Saste","hospital Address:Pimpri","Exp : 5yrs","Mobile No:9890864123","600"},
                        {"Doctor Name:Prasad Pawar","hospital Address:Nigdi","Exp : 15yrs","Mobile No:9890864121","900"},
                        {"Doctor Name:Swapnil Kale","hospital Address:Pune","Exp : 8yrs","Mobile No:9890864122","300"},
                        {"Doctor Name:Deepak Deshmukh","hospital Address:chinchwad","Exp : 6yrs","Mobile No:9890864124","500"},
                        {"Doctor Name:Ashok panda","hospital Address:Katraj","Exp : 7yrs","Mobile No:9890864125","800"},
                };
        private String[][] doctor_details2 =
                {
                        {"Doctor Name:Neelam Patil","hospital Address:Pimpri","Exp : 5yrs","Mobile No:9890864123","600"},
                        {"Doctor Name:Swathi Pawar","hospital Address:Nigdi","Exp : 15yrs","Mobile No:9890864121","900"},
                        {"Doctor Name:Neeraja Kale","hospital Address:Pune","Exp : 8yrs","Mobile No:9890864122","300"},
                        {"Doctor Name:Mayuri Deshmukh","hospital Address:chinchwad","Exp : 6yrs","Mobile No:9890864124","500"},
                        {"Doctor Name:Minakshipanda","hospital Address:Katraj","Exp : 7yrs","Mobile No:9890864125","800"},
                };
        private String[][] doctor_details3 =
                {
                        {"Doctor Name:seema Saste","hospital Address:Pimpri","Exp : 5yrs","Mobile No:9890864123","600"},
                        {"Doctor Name:Pankaj Pawar","hospital Address:Nigdi","Exp : 15yrs","Mobile No:9890864121","500"},
                        {"Doctor Name:Monish Kale","hospital Address:Pune","Exp : 8yrs","Mobile No:9890864122","300"},
                        {"Doctor Name:Vishal Deshmukh","hospital Address:chinchwad","Exp : 6yrs","Mobile No:9890864124","200"},
                        {"Doctor Name:Sharikant panda","hospital Address:Katraj","Exp : 7yrs","Mobile No:9890864125","700"},
                };
        private String[][] doctor_details4 =
                {
                        {"Doctor Name:Amol Saste","hospital Address:Pimpri","Exp : 5yrs","Mobile No:9890864123","600"},
                        {"Doctor Name:Prasad Pawar","hospital Address:Nigdi","Exp : 15yrs","Mobile No:9890864121","500"},
                        {"Doctor Name:nilesh Kale","hospital Address:Pune","Exp : 8yrs","Mobile No:9890864122","200"},
                        {"Doctor Name:Deepak Deshpande","hospital Address:chinchwad","Exp : 6yrs","Mobile No:9890864124","500"},
                        {"Doctor Name:Ankul pande","hospital Address:Katraj","Exp : 7yrs","Mobile No:9890864125","400"},
                };
        private String[][] doctor_details5 =
                {
                        {"Doctor Name:Ajit gowda","hospital Address:Pimpri","Exp : 5yrs","Mobile No:9890864123","700"},
                        {"Doctor Name:Prasad pande","hospital Address:Nigdi","Exp : 15yrs","Mobile No:9890864121","900"},
                        {"Doctor Name:Swapnil Aradhya","hospital Address:Pune","Exp : 8yrs","Mobile No:9890864122","800"},
                        {"Doctor Name:Deepak pande","hospital Address:chinchwad","Exp : 6yrs","Mobile No:9890864124","1500"},
                        {"Doctor Name:Ashok Gowda","hospital Address:Katraj","Exp : 7yrs","Mobile No:9890864125","1200"},
                };

    TextView tv;
    Button btn;
    String[][] doctor_details = {};
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);

        tv = findViewById(R.id.textViewDDTitle);
        btn = findViewById(R.id.buttonDDBack);

        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);

        if(title.compareTo("Family Physicians")==0)
            doctor_details = doctor_details1;
        else
        if(title.compareTo("Dietician")==0)
            doctor_details = doctor_details2;
        else
        if(title.compareTo("Dentiest")==0)
            doctor_details = doctor_details3;
        else
        if(title.compareTo("Surgeon")==0)
            doctor_details = doctor_details4;
        else
            doctor_details = doctor_details5;

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DoctorDetailsActivity.this, FindDoctorActivity.class));
            }
        });
        list =new ArrayList();
        for(int i=0;i<doctor_details.length;i++){
            item = new HashMap<String,String>();
            item.put( "line1",doctor_details[i][0]);
            item.put( "line2",doctor_details[i][1]);
            item.put( "line3",doctor_details[i][2]);
            item.put( "line4",doctor_details[i][3]);
            item.put( "line5","Cons Fees:"+doctor_details[i][4]+"/-");
            list.add( item );
        }
        sa = new SimpleAdapter(this,list,
                R.layout.multi_lines,
                new String[]{"line1","line2","line3","line4","line5"},
                new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e}
        );
        ListView lst=findViewById(R.id.listViewDD);
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent it = new Intent(DoctorDetailsActivity.this,BookAppointmentActivity.class);
                it.putExtra("text1",title);
                it.putExtra("text2",doctor_details[i][0]);
                it.putExtra("text3",doctor_details[i][1]);
                it.putExtra("text4",doctor_details[i][3]);
                it.putExtra("text5",doctor_details[i][4]);
                startActivity(it);
            }
        });
        
    }
}

    