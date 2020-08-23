(function () {
    EC('line-chart', {
        tooltip: {
            trigger: 'axis',
            axisPointer: {
                lineStyle: {
                    width: 2,
                    color: '#595959'
                }
            }
        },
        legend: {
            data: ['客流量', '笔数'],
            right: '10%'
        },
        xAxis: {
            type: 'category',
            data: ['10:00', '10:30', '11:00', '11:30', '12:00', '12:30', '13:00'],
            axisTick: {
                alignWithLabel: true
            },
            axisLine: {
                lineStyle: {
                    color: '#595959'
                }
            }
        },
        yAxis: {
            type: 'value',
            splitLine: {
                lineStyle: {
                    color: ['#E8E8E8'],
                    type: 'dashed'
                }
            },
            axisLine: {
                lineStyle: {
                    color: '#595959'
                }
            }
        },
        series: [{
            name: '客流量',
            data: [820, 932, 901, 934, 120, 468, 120],
            type: 'line'
        }, {
            name: '笔数',
            data: [123, 324, 489, 354, 489, 657, 486],
            type: 'line'
        }]
    });
})();