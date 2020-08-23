(function () {
    var $left = $('.left');
    $('.navbar-toggler').on('click', function () {
        $left.toggleClass('left-collapse');
    });

    $(document).on('click', '.tab > .tab-head > .tab-item', function () {
        var $this = $(this),
            $cont = $('#' + $this.data('toggle'));
        $this.addClass('active').siblings().removeClass('active');

        $cont.addClass('active').siblings().removeClass('active');
        $cont.trigger('onTabShow');
    });

    $(document).on('click', '.c-menu-head', function () {
        $(this).parent().toggleClass('c-menu-close');
    });

    $(document).on('click', '.c-menu-item', function () {
        $(this).addClass('active').parents('.c-menu-list').find('.c-menu-item').not(this).removeClass('active');
    });
})();

function EC(id, options) {
    var chart = echarts.init($('#' + id)[0]);
    chart.setOption(options);
    return chart;
}