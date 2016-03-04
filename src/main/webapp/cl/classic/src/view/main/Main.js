/**
 * This class is the main view for the application. It is specified in app.js as the
 * "mainView" property. That setting automatically applies the "viewport"
 * plugin causing this view to become the body element (i.e., the viewport).
 *
 * TODO - Replace this content of this view to suite the needs of your application.
 */
Ext.define('Clinic.view.main.Main', {
    extend: 'Ext.panel.Panel',
    xtype: 'app-main',

    requires: [
        'Ext.plugin.Viewport',
        'Ext.window.MessageBox',

        'Clinic.view.main.MainController',
        'Clinic.view.main.MainModel',
        'Clinic.view.main.List'
    ],

    controller: 'main',
    viewModel: 'main',

    ui: 'navigation',
    layout: 'card',

    header: {
        title: {
            bind: {
                text: '{name}'
            }
        },
        iconCls: 'fa-heartbeat'
    },   
    tools:[{
    	type: 'gear',
    	tooltip: 'Settings',
        handler: function(event, toolEl, panelHeader) {
        }
    },
    {
        type:'help',
        tooltip: 'Get Help',
        callback: function(panel, tool, event) {
            // show help here
        }
    }],
//    defaults: {
//        bodyPadding: 20        
//    },

    items: [{
//        title: 'Home',
//        iconCls: 'fa-home',
//        // The following grid shares a store with the classic version's grid as well!
//        items: [{
//            xtype: 'mainlist'
//        }]
//    }, {
//        title: 'Users',
//        iconCls: 'fa-user',
//        bind: {
//            html: '{loremIpsum}'
//        }
//    }, {
//        title: 'Groups',
//        iconCls: 'fa-users',
//        bind: {
//            html: '{loremIpsum}'
//        }
//    }, {
//        title: 'Settings',
//        iconCls: 'fa-cog',
//        bind: {
//            html: '{loremIpsum}'
//        }
//    },{
//        title: 'Logout',
//        iconCls: 'fa-cog'
    }]
});
