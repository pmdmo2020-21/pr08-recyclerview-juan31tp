package es.iessaladillo.pedrojoya.pr06.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(val id: Long, val name: String, val email: String, val address: String, val web: String, val phoneNumber: String, val photoUrl: String): Parcelable
