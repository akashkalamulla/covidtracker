package com.covidtracker.covidtracker.services;

import com.covidtracker.covidtracker.model.LocationStats;
import jakarta.annotation.PostConstruct;
import org.springframework.scheduling.annotation.Scheduled;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

public class CoronaVirusDataServices {

    private static String VIRUS_DATA_URL = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv";
    private List<LocationStats> allStats = new ArrayList<>();
    public List<LocationStats> getAllStats(){
        return allStats;
    }

    @PostConstruct
    @Scheduled(cron = "1 * * * * *")
    public void fetchVirusData() throws IOException, InterruptedIOException{

    }
}
