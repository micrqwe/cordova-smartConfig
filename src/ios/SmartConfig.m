#import "SmartConfig.h"
#import <Cordova/CDVPlugin.h>

@implementation SmartConfig

//-(void)pluginInitialize{
//    CDVViewController *viewController = (CDVViewController *)self.viewController;
//}

- (void) hello:(CDVInvokedUrlCommand*)command
{
//    self.currentCallbackId = command.callbackId;
    /*
     *生成订单信息及签名
     */

    //从API请求获取支付信息
    NSMutableDictionary *args = [command argumentAtIndex:0];

    NSString *orderString = [args objectForKey:@"params"];
    NSLog(@"orderString = %@",orderString);

    CDVPluginResult* pluginResult = nil;
    if (orderString != nil && [orderString length] > 0) {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:orderString];
    } else {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_ERROR];
    }
    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end
