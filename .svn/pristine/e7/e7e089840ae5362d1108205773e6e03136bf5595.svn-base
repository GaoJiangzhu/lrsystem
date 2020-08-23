(function () {
    EC('resOrderCount-chart', {
        color: ['#74BCFF', '#2EC25A'],
        legend: {
            data: ['客流量', '支付笔数'],
            right: 10,
            itemWidth: 14,
            borderRadius: 10
        },
        tooltip: {
            trigger: 'axis',
            axisPointer: { // 坐标轴指示器，坐标轴触发有效
                type: 'shadow' // 默认为直线，可选为：'line' | 'shadow'
            }
        },
        grid: {
            left: '0',
            right: '0',
            bottom: '0',
            containLabel: true
        },
        xAxis: [{
            type: 'category',
            data: ['一月', '二月', '三月', '四月', '五月', '六月', '七月', '八月', '九月', '十月', '十一月', '十二月'],
            axisLine: {
                lineStyle: {
                    color: '#595959'
                }
            }
        }],
        yAxis: [{
            type: 'value',
            axisLine: {
                lineStyle: {
                    color: '#595959'
                }
            },
            splitLine: {
                lineStyle: {
                    color: ['#E8E8E8'],
                    type: 'dashed'
                }
            }
        }],
        series: [{
            name: '客流量',
            type: 'bar',
            barWidth: '25%',
            data: [10, 52, 200, 334, 390, 330, 10, 52, 200, 334, 390, 330]
        }, {
            name: '支付笔数',
            type: 'bar',
            barWidth: '25%',
            data: [390, 330, 10, 52, 200, 334, 390, 330, 10, 52, 200, 334]
        }]
    });

    $('#resArrCount').one('onTabShow', function () {
        var chart = EC('resArrCount-chart', {
            color: ['#74BCFF', '#2EC25A'],
            legend: {
                data: ['客流量', '支付笔数'],
                right: 10,
                itemWidth: 14,
                borderRadius: 10
            },
            dataset: {
                source: [
                    ['product', '一月', '二月', '三月', '四月', '五月', '六月', '七月', '八月', '九月', '十月', '十一月', '十二月'],
                    ['客流量', 10, 52, 200, 334, 390, 330, 10, 52, 200, 334, 390, 330],
                    ['支付笔数', 390, 330, 10, 52, 200, 334, 390, 330, 10, 52, 200, 334]
                ]
            },
            tooltip: {
                trigger: 'axis',
                axisPointer: { // 坐标轴指示器，坐标轴触发有效
                    type: 'shadow' // 默认为直线，可选为：'line' | 'shadow'
                }
            },
            grid: {
                left: '0',
                bottom: '0',
                right: '30%',
                containLabel: true
            },
            xAxis: [{
                type: 'category',
                data: ['一月', '二月', '三月', '四月', '五月', '六月', '七月', '八月', '九月', '十月', '十一月', '十二月'],
                axisLine: {
                    lineStyle: {
                        color: '#595959'
                    }
                }
            }],
            yAxis: [{
                type: 'value',
                axisLine: {
                    lineStyle: {
                        color: '#595959'
                    }
                },
                splitLine: {
                    lineStyle: {
                        color: ['#E8E8E8'],
                        type: 'dashed'
                    }
                }
            }],
            series: [{
                type: 'bar',
                barWidth: '25%',
                seriesLayoutBy: 'row'
            }, {
                type: 'bar',
                barWidth: '25%',
                seriesLayoutBy: 'row'
            }, {
                id: 'pie',
                type: 'pie',
                radius: ['50%', '70%'],
                center: ['85%', '50%'],
                avoidLabelOverlap: false,
                label: {
                    formatter: '{b}: {@一月} ({d}%)'
                },
                encode: {
                    itemName: 'product',
                    value: '一月',
                    tooltip: '一月'
                }
            }]
        });

        chart.on('updateAxisPointer', function (event) {
            var xAxisInfo = event.axesInfo[0];
            if (xAxisInfo) {
                var dimension = xAxisInfo.value + 1;
                chart.setOption({
                    series: {
                        id: 'pie',
                        label: {
                            formatter: '{b}: {@[' + dimension + ']} ({d}%)'
                        },
                        encode: {
                            value: dimension,
                            tooltip: dimension
                        }
                    }
                });
            }
        });
    });

})();