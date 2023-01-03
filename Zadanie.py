from kivy.app import App
from kivy.clock import Clock
from kivy.uix.label import Label
from kivy.uix.button import Button
from kivy.uix.boxlayout import BoxLayout
from kivy.core.window import Window
from datetime import datetime

import time
import pytz

Window.size = (600, 100)
class myclock(Label):
    timezone = 'Europe/Warsaw'

    def update(self, *args):
        date = datetime.now(pytz.timezone(self.timezone))
        self.text = date.strftime("%H:%M:%S")
    def changeZone(self, zone):
        self.timezone = zone
        layout = BoxLayout(orientation='vertical')

        layout2 = BoxLayout(orientation='horizontal')
        layout.add_widget(layout2)

        bt1 = Button(text='NOWY YORK', font_size= 20,size=(10, 10))
        bt1.bind(on_press=lambda x: clock1.changeZone('America/New_York'))
        layout2.add_widget(bt1)

        bt2 = Button(text='WARSZAWA',font_size= 20, size=(10, 10))
        bt2.bind(on_press=lambda x: clock1.changeZone('Europe/Warsaw'))
        layout2.add_widget(bt2)
        zdef build(self):

        bt3 = Button(text='MOSKWA',font_size= 20, size=(10, 10))
        bt3.bind(on_press=lambda x: clock1.changeZone('Europe/Moscow'))
        layout2.add_widget(bt3)

        bt4 = Button(text='LONDYN',font_size= 20, size=(10, 10))
        bt4.bind(on_press=lambda x: clock1.changeZone('Europe/London'))
        layout2.add_widget(bt4)

        bt5 = Button(text='TOKYO',font_size= 20, size=(10, 10))
        bt5.bind(on_press=lambda x: clock1.changeZone('Asia/Tokyo'))
        layout2.add_widget(bt5)

        clock1 = myclock()
        Clock.schedule_interval(clock1.update, 1)
        layout.add_widget(clock1)

        return layout
 
root = TimeApp()
root.run()

#pip install pytz