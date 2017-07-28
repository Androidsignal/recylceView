package com.example.tops.recycleviewdemo1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    //public String url_data="https://api.androidhive.info/contacts/";
    ArrayList<Listitem> listitems;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.mylist);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listitems = new ArrayList<>();

        //  loadRecycledata();

            Listitem listitem = new Listitem();
            listitem.setId("1");
            listitem.setLname("ghugho");
            listitem.setFname("ravi");
            listitems.add(listitem);

            listitem = new Listitem();
            listitem.setId("2");
            listitem.setLname("ravi2");
            listitem.setFname("ravi2");
            listitems.add(listitem);

            Adpt adpt = new Adpt(listitems, this);
            recyclerView.setAdapter(adpt);


//        public void loadRecycledata(){
//           final ProgressDialog progressDialog=new ProgressDialog(this);
//            progressDialog.setMessage("wait");
//            progressDialog.show();
//        StringRequest stringRequest=new StringRequest(Request.Method.POST, url_data, new Response.Listener<String>() {
//            @Override
//            public void onResponse(String response) {
//                progressDialog.dismiss();
//
//                Log.e("res",response+"res ");
//                try {
//
//                    JSONObject jsonObject = new JSONObject(response);
//                    JSONArray jsonArray = jsonObject.getJSONArray("contacts");
//                    for(int i=0;i<=jsonArray.length();i++)
//                    {
//                        JSONObject o=jsonArray.getJSONObject(i);
//                        Listitem listitem  = new Listitem();
//                        listitem.setId(o.getString("id"));
//                        listitem.setFname(o.getString("name"));
//                        listitem.setLname(o.getString("email"));
//
//                        listitems.add(listitem);
//
//                    }
//
//
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//                Adpt adpt  =new Adpt(listitems,MainActivity.this);
//                recyclerView.setAdapter(adpt);
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//
//                Log.e("res",error.getMessage()+"er ");
//                Toast.makeText(MainActivity.this, ""+error.getMessage(), Toast.LENGTH_SHORT).show();
//            }
//        });
//
//            RequestQueue requestQueue= Volley.newRequestQueue(this);
//            requestQueue.add(stringRequest);

        // }

    }
}

