/**
 * This class is the controller for the main view for the application. It is specified as
 * the "controller" of the Main view class.
 *
 * TODO - Replace this content of this view to suite the needs of your application.
 */
Ext.define('Unrestricted.view.login.LoginController', {
	extend : 'Ext.app.ViewController',
	alias : 'controller.login',
	onUsernameAferRender : function(field) {
		field.focus();
	},
	onLoginClick : function() {
		var me = this,
			form = me.getView().getForm(),
			vm = me.getViewModel();
		form.submit({
			method : 'POST',
			waitTitle : 'កំំពុងតភ្ជាប់',
			waitMsg : 'សូមរង់ចាំ...',
			success : function(form, action) {
				window.location = 'index.html';
				me.setIsFailedLogin(vm, false);
			},
			failure : function(form, action) {
				me.setIsFailedLogin(vm, true);
				form.reset();
			}
		});
	},
	setIsFailedLogin: function(vm, value) {
		vm.set('isFailedLogin', value);
	},
	onFormPanelAfterRender: function(formPanel) {
		var me = this,
			nav = Ext.create('Ext.util.KeyNav', {
			target: formPanel.getEl(),
			enter: function() {
				me.onLoginClick();
			},
			scope: me
		});
	},
	onItemSelected : function(sender, record) {
		Ext.Msg.confirm('Confirm', 'Are you sure?', 'onConfirm', this);
	},

	onConfirm : function(choice) {
		if (choice === 'yes') {
			//
		}
	}
});
