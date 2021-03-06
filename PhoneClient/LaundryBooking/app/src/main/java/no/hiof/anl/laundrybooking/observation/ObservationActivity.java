package no.hiof.anl.laundrybooking.observation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import no.hiof.anl.laundrybooking.R;
import no.hiof.anl.laundrybooking.booking.BookingActivity;

/**
 * Created by An on 11/20/2015.
 */
public class ObservationActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

       // super.onCreate(savedInstanceState);
        setContentView(R.layout.observation_activity);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setupUIEvents();
    }

    private void setupUIEvents() {
        Button btnGoToBooking = (Button) findViewById(R.id.btnGoToBooking);
        btnGoToBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenBookingActivity();

            }
        });

        Button btnGoToBooking2 = (Button) findViewById(R.id.btnGoToBooking2);
        btnGoToBooking2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenBookingActivity();

            }
        });

        Button btnGoToBooking3 = (Button) findViewById(R.id.btnGoToBooking3);
        btnGoToBooking3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenBookingActivity();

            }
        });

        Button btnGoToBooking4 = (Button) findViewById(R.id.btnGoToBooking4);
        btnGoToBooking4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenBookingActivity();

            }
        });

    }

    private void OpenBookingActivity(){
        Intent myIntent = new Intent(ObservationActivity.this, BookingActivity.class);
        myIntent.putExtra("caller", R.id.drawer_my_booking);
        ObservationActivity.this.startActivity(myIntent);
    }
}