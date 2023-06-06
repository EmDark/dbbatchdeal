package com.leon.dbbatchdeal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

/**
 * 文件描述
 *
 * @Package: dbbatchdeal
 * @Description: note
 * @Author: 胡亮
 * @Version: 1.0
 * @date: 2023/4/23 - 17:43
 * <p>
 * Copyright © 2023 Hundsun Technologies Inc. All Rights Reserved
 */
public class StockChart extends Application {

    public StockChart() {
    }

    private List<StockQuote> quotes;
    private List<BigDecimal> ma;

    public StockChart(List<StockQuote> quotes, List<BigDecimal> ma) {
        this.quotes = quotes;
        this.ma = ma;
    }

    class StockQuote {

        Double close;

        public Double getClose() {
            return close;
        }

        public void setClose(Double close) {
            this.close = close;
        }
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Stock Chart");
        this.quotes = new ArrayList<>();
        this.ma = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            StockQuote stockQuote = new StockQuote();
            stockQuote.setClose(new Random().nextDouble());
            quotes.add(stockQuote);
        }
        for (int i = 0; i < 50; i++) {
            ma.add(new BigDecimal(new Random().nextDouble()));
        }
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Time");
        yAxis.setLabel("Price");

        final LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Stock Quotes");

        XYChart.Series<Number, Number> quoteSeries = new XYChart.Series<>();
        quoteSeries.setName("Quotes");
        for (int i = 0; i < quotes.size(); i++) {
            quoteSeries.getData().add(new XYChart.Data<>(i, quotes.get(i).getClose()));
        }

        XYChart.Series<Number, Number> maSeries = new XYChart.Series<>();
        maSeries.setName("MA");
        for (int i = 0; i < ma.size(); i++) {
            maSeries.getData().add(new XYChart.Data<>(i, ma.get(i)));
        }

        Scene scene = new Scene(lineChart, 800, 600);
        lineChart.getData().addAll(quoteSeries, maSeries);

        stage.setScene(scene);
        stage.show();
    }
}
