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
	title: 'ពាក្យសុំចូលប្រើ',
	url : 'login',
	defaults : {
		anchor : '100%'
	},
	defaultType : 'textfield',
	items : [ {
		fieldLabel : 'ឈ្មោះអ្នកប្រើ',
		name : 'username',
		itemId: 'username',
		allowBlank : false
	}, {
		fieldLabel : 'ពាក្យសម្ងាត់',
		name : 'password',
		itemId: 'password',
		allowBlank : false,
		inputType: 'password'
	} ],
	buttons : [ {
		text : 'ចូល',
		formBind : true,
		handler: 'onLoginClick'
	} ]
});