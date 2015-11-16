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
	url : 'login',
	layout : 'anchor',
	title: 'ពាក្យសុំចូលប្រើ',
	bodyPadding: '10 0 0 0',
	maxHeight: 200,
	defaults : {
		anchor : '100%'
	},
	defaultType : 'textfield',
	items : [ {
		fieldLabel : 'ឈ្មោះអ្នកប្រើ',
		name : 'username',
		itemId: 'username',
		allowBlank : false,
		listeners: {
			afterrender: 'onUsernameAferRender'
		}
	}, {
		fieldLabel : 'ពាក្យសម្ងាត់',
		name : 'password',
		itemId: 'password',
		allowBlank : false,
		inputType: 'password'
	}, {
		xtype: 'label',
		cls: 'login-error',
		text: 'សូម​ទោស មិន​ស្គាល់​ឈ្មោះ​អ្នក​ប្រើ ឬ​ពាក្យ​សម្ងាត់ទេ។',
		bind: {
			hidden: '{!isFailedLogin}'
		}
	} ],
	buttons : [ {
		text : 'ចូល',
		formBind : true,
		handler: 'onLoginClick'
	}],
	listeners: {
		afterrender: 'onFormPanelAfterRender'
	}
});