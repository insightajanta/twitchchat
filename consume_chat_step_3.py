#!/usr/bin/python -u

from sys import argv

from src.kafka.consumer import ChatMessageConsumer
from src.twitch_bot.bot import *
from src.config.config import *
from src.kafka import *

print 'About to start to consume chat'
ChatMessageConsumer(config).run()

