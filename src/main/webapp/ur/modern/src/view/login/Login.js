/**
 * Created by S on 11/7/2015.
 */
Ext.define('Unrestricted.view.login.Login', {
	extend : 'Ext.form.Panel',
	xtype : 'login',
	requires : [ 'Unrestricted.view.login.LoginController',
			'Unrestricted.view.login.LoginModel' ],
	controller : 'login',
	viewModel : 'login',
	layout : 'anchor',
	defaults : {
		anchor : '100%'
	},
	defaultType : 'textfield',
	items : [ {
		fieldLabel : 'ឈ្មោះអ្នកប្រើ',
		name : 'username',
		allowBlank : false
	}, {
		fieldLabel : 'ពាក្យសម្ងាត់',
		name : 'password',
		allowBlank : false
	} ],
	buttons : [ {
		text : 'ចូល',
		formBind : true
	} ]
});