package net.syyama.photondemo;

import android.os.AsyncTask;
import android.util.Log;
import de.exitgames.api.loadbalancing.LoadBalancingPeer;
import de.exitgames.client.photon.EventData;
import de.exitgames.client.photon.IPhotonPeerListener;
import de.exitgames.client.photon.OperationResponse;
import de.exitgames.client.photon.StatusCode;
import de.exitgames.client.photon.enums.ConnectionProtocol;
import de.exitgames.client.photon.enums.DebugLevel;

public class PhotonController extends AsyncTask<String, Integer, Long>
		implements IPhotonPeerListener {
	
	final String TAG = "PhotonController";

	LoadBalancingPeer peer;

	public static final String SERVER_ADDRESS = "app-jp.exitgamescloud.com:5055";
	public static final String APPLICATION_ID = "55af0e64-adaa-4cbc-8dfb-e7e383ba93ab";

	public boolean connect() {
		peer = new LoadBalancingPeer(this, ConnectionProtocol.Udp);
		
		if (peer.connect(SERVER_ADDRESS, APPLICATION_ID)) {
			Log.e(TAG, "�ڑ���");
			return true;
		}
		Log.e(TAG, "�ڑ�����Ă��܂���");
		return false;
	}

	@Override
	public void debugReturn(DebugLevel arg0, String arg1) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}

	@Override
	public void onEvent(EventData arg0) {
		Log.d(TAG, "onEvent");
		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}

	@Override
	public void onOperationResponse(OperationResponse arg0) {
		Log.d(TAG, "onOperationResponse");
		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}

	@Override
	public void onStatusChanged(StatusCode arg0) {
		Log.d(TAG, "onStatusChanged");
		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}

	@Override
	protected Long doInBackground(String... params) {
		Log.d(TAG, "doInBackground");
		connect();
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return null;
	}
}
