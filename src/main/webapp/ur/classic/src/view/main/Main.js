/**
 * This class is the main view for the application. It is specified in app.js as the
 * "mainView" property. That setting automatically applies the "viewport"
 * plugin causing this view to become the body element (i.e., the viewport).
 *
 * TODO - Replace this content of this view to suite the needs of your application.
 */
Ext.define('Unrestricted.view.main.Main', {
    extend: 'Ext.panel.Panel',
    xtype: 'app-main',
    requires : [ 'Unrestricted.view.main.MainModel', 'Unrestricted.view.main.MainController', 'Ext.plugin.Viewport',
                 'Unrestricted.view.login.Login'],
    controller: 'main',
    viewModel: 'main',
    ui: 'title',
    header: {
        title: {
            bind: {
                text: '{name}'
            }
        },
        iconCls: 'fa-heartbeat'
    },
    layout: 'center',
    url : 'j_spring_security_check',
    items: [{
        xtype: 'login',
        width: '50%',
        height: '50%'
    }]
});
