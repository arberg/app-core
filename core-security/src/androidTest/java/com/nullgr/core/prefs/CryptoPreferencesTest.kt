package com.nullgr.core.prefs

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import com.nullgr.core.security.prefs.CryptoPreferences
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Created by Grishko Nikita on 01.02.18.
 */
@RunWith(AndroidJUnit4::class)
class CryptoPreferencesTest {
    companion object {
        private const val ALIAS = "ApplicationTestAlias"
        private const val VALUE_TO_SAVE = "This is value to save"
    }

    @Test
    fun setString_SameAlias_Success() {
        val cryptoPreferences = CryptoPreferences(InstrumentationRegistry.getTargetContext(), ALIAS)
        cryptoPreferences.setString("prefs_key_string", VALUE_TO_SAVE)
    }

    @Test
    fun getString_afterSetString_SameAlias_Success() {
        val cryptoPreferences = CryptoPreferences(InstrumentationRegistry.getTargetContext(), ALIAS)
        cryptoPreferences.setString("prefs_key_string", VALUE_TO_SAVE)
        val value = cryptoPreferences.getString("prefs_key_string", null)
        Assert.assertEquals(VALUE_TO_SAVE, value)
    }

    @Test
    fun getString_afterSetString_DifferentAlias_Fails() {
        val cryptoPreferences = CryptoPreferences(InstrumentationRegistry.getTargetContext(), ALIAS, "prefs-file-name")

        cryptoPreferences.setString("prefs_key_string", VALUE_TO_SAVE)

        val cryptoPreferences2 = CryptoPreferences(InstrumentationRegistry.getTargetContext(), ALIAS + "OTHER", "prefs-file-name")
        val value = cryptoPreferences2.getString("prefs_key_string", null)

        Assert.assertNotEquals(VALUE_TO_SAVE, value)
        Assert.assertNull(value)
    }
}