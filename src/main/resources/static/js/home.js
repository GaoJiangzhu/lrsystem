(function () {
    EC('pay-chart', {
        tooltip: {
            formatter: "{a} <br/>{b} : {c}%"
        },
        series: [{
            name: '支付情况',
            type: 'gauge',
            radius: '100%',
            splitNumber: 1,
            pointer: {
                width: 5
            },
            axisLine: {
                lineStyle: {
                    width: 15,
                    color: [
                        [1, '#74BCFF']
                    ]
                }
            },
            axisLabel: {
                show: false
            },
            title: {
                offsetCenter: [0, '70%'],
                color: '#74BCFF'
            },
            detail: {
                show: false
            },
            data: [{
                value: 56,
                name: 'PORTFOLIO'
            }]
        }]
    });

    EC('bar-chart', {
        color: ['#74BCFF'],
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
            top: 10,
            containLabel: true
        },
        xAxis: [{
            type: 'category',
            data: ['一月', '二月', '三月', '四月', '五月', '六月'],
            axisLine: {
                lineStyle: {
                    color: '#595959'
                }
            },
            axisTick: {
                alignWithLabel: true
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
            name: '工作量',
            type: 'bar',
            barWidth: '60%',
            data: [10, 52, 200, 334, 390, 330]
        }]
    });
})();